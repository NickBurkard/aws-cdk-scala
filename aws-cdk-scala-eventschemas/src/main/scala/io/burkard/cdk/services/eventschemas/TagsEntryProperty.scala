package io.burkard.cdk.services.eventschemas

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object TagsEntryProperty {

  def apply(
    key: Option[String] = None,
    value: Option[String] = None
  ): software.amazon.awscdk.services.eventschemas.CfnDiscoverer.TagsEntryProperty =
    (new software.amazon.awscdk.services.eventschemas.CfnDiscoverer.TagsEntryProperty.Builder)
      .key(key.orNull)
      .value(value.orNull)
      .build()
}
