package io.burkard.cdk.services.eventschemas

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TagsEntryProperty {

  def apply(
    key: String,
    value: String
  ): software.amazon.awscdk.services.eventschemas.CfnSchema.TagsEntryProperty =
    (new software.amazon.awscdk.services.eventschemas.CfnSchema.TagsEntryProperty.Builder)
      .key(key)
      .value(value)
      .build()
}
