package io.burkard.cdk.services.stepfunctions

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object TagsEntryProperty {

  def apply(
    key: Option[String] = None,
    value: Option[String] = None
  ): software.amazon.awscdk.services.stepfunctions.CfnActivity.TagsEntryProperty =
    (new software.amazon.awscdk.services.stepfunctions.CfnActivity.TagsEntryProperty.Builder)
      .key(key.orNull)
      .value(value.orNull)
      .build()
}
