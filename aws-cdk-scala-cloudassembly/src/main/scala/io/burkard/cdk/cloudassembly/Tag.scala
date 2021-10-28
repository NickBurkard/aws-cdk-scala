package io.burkard.cdk.cloudassembly

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object Tag {

  def apply(
    key: Option[String] = None,
    value: Option[String] = None
  ): software.amazon.awscdk.cloudassembly.schema.Tag =
    (new software.amazon.awscdk.cloudassembly.schema.Tag.Builder)
      .key(key.orNull)
      .value(value.orNull)
      .build()
}
