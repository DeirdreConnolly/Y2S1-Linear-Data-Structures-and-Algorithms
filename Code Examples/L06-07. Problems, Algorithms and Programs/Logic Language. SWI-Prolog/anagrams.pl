%
%----------------------------------
%
% MAIN FUNCTION
%
%----------------------------------
%
%anagrams2/3(+L1, +L2, -B). 
anagrams2(L1, L2, Res) :-
	bubble_sort(L1, OL1),
	bubble_sort(L2, OL2),
	are_equal(OL1, OL2, Res). 
%
%----------------------------------
%
% EXTRA FUNCTIONS
%
%----------------------------------
%
%change/4(+X, +Y, -A, -B).
change(X, Y, Y, X) :-
	X > Y,
	!.
change(X, Y, X, Y).
%
%set_biggest/2(+L, -NL).
set_biggest([X], [X]).
set_biggest([X,Y|Xs], Res) :-
	change(X,Y,A,B),
	set_biggest([B|Xs], R),
	concat([A], R, Res).
%
%remove_last/2(+L, -NL).
remove_last([_], []).
remove_last([X,Y|Xs], Res) :-
	remove_last([Y|Xs], R),
	concat([X], R, Res).
%
%tail/2(+L, -E).
tail([X], X).
tail([_,Y|Xs], Res) :-
	tail([Y|Xs], Res).
%
%concat/3(+L1, +L2, -NL).
concat([], L, L).
concat([X|Xs], Ys, [X|Res]) :-
	concat(Xs, Ys, Res). 
%
%bubble_sort/2(+L, -NL).
bubble_sort([], []).
bubble_sort([X|Xs], Res) :-
	set_biggest([X|Xs], L),
	tail(L, Last),
	remove_last(L, NoLast), 
	bubble_sort(NoLast, R),
	concat(R, [Last], Res).
%
%are_equal/3(+L1, +L2, -B).
are_equal([], [], true).
are_equal([X|Xs], [X|Ys], Res) :-
	are_equal(Xs, Ys, Res),
	!.
are_equal(_, _, false).
%
%----------------------------------
% GOALS
%----------------------------------
%
%anagrams2([3,4,7,6,5], [7,6,3,4,5], Res).
%
%anagrams2([5,5,6,6,7], [6,6,8,8,5], Res).
%

