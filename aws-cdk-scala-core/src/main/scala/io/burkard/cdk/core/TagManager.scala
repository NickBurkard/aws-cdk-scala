package io.burkard.cdk.core

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object TagManager {

  def apply(
    tagType: software.amazon.awscdk.TagType,
    resourceTypeName: String,
    tagStructure: AnyRef,
    tagPropertyName: Option[String] = None
  ): software.amazon.awscdk.TagManager =
    software.amazon.awscdk.TagManager.Builder
      .create(tagType, resourceTypeName, tagStructure)
      .tagPropertyName(tagPropertyName.orNull)
      .build()
}
