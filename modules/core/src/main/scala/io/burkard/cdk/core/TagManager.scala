package io.burkard.cdk.core

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TagManager {

  def apply(
    tagType: software.amazon.awscdk.TagType,
    resourceTypeName: String,
    tagStructure: AnyRef,
    tagPropertyName: String
  ): software.amazon.awscdk.TagManager =
    software.amazon.awscdk.TagManager.Builder
      .create(tagType, resourceTypeName, tagStructure)
      .tagPropertyName(tagPropertyName)
      .build()
}
