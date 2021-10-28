package io.burkard.cdk.core

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object TagManagerOptions {

  def apply(
    tagPropertyName: Option[String] = None
  ): software.amazon.awscdk.TagManagerOptions =
    (new software.amazon.awscdk.TagManagerOptions.Builder)
      .tagPropertyName(tagPropertyName.orNull)
      .build()
}
