package ai;

import board.Board;
import board.Move;

public interface MoveStrategy {

    long getNumBoardsEvaluated();

    Move execute(Board board, int depth);

}
