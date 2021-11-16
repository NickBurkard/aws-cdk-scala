package io.burkard.cdk.cloudassembly

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object Tag {

  def apply(
    key: String,
    value: String
  ): software.amazon.awscdk.cloudassembly.schema.Tag =
    (new software.amazon.awscdk.cloudassembly.schema.Tag.Builder)
      .key(key)
      .value(value)
      .build()
}
