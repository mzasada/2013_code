package pl.kaczanowscy.tomek;

public interface AuctionProcessor {
	AuctionState process(Item item, int bid);
}
