package io.burkard.cdk.cxapi

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SynthesisMessage {

  def apply(
    entry: Option[software.amazon.awscdk.cloudassembly.schema.MetadataEntry] = None,
    id: Option[String] = None,
    level: Option[software.amazon.awscdk.cxapi.SynthesisMessageLevel] = None
  ): software.amazon.awscdk.cxapi.SynthesisMessage =
    (new software.amazon.awscdk.cxapi.SynthesisMessage.Builder)
      .entry(entry.orNull)
      .id(id.orNull)
      .level(level.orNull)
      .build()
}
