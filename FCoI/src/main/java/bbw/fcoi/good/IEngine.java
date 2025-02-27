package bbw.fcoi.good;

/**
 * In order to add an Engine, regardless of its type, it must be abstracted as an interface.
 * That way, we can add new types of engines without having to change existing code.
 */
public interface IEngine {
	void start();
}
