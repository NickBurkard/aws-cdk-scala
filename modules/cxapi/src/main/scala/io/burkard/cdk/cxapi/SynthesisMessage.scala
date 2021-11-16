package io.burkard.cdk.cxapi

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SynthesisMessage {

  def apply(
    entry: software.amazon.awscdk.cloudassembly.schema.MetadataEntry,
    id: String,
    level: software.amazon.awscdk.cxapi.SynthesisMessageLevel
  ): software.amazon.awscdk.cxapi.SynthesisMessage =
    (new software.amazon.awscdk.cxapi.SynthesisMessage.Builder)
      .entry(entry)
      .id(id)
      .level(level)
      .build()
}
