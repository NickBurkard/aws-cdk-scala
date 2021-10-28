package io.burkard.cdk.services.backup

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object TagCondition {

  def apply(
    key: Option[String] = None,
    operation: Option[software.amazon.awscdk.services.backup.TagOperation] = None,
    value: Option[String] = None
  ): software.amazon.awscdk.services.backup.TagCondition =
    (new software.amazon.awscdk.services.backup.TagCondition.Builder)
      .key(key.orNull)
      .operation(operation.orNull)
      .value(value.orNull)
      .build()
}
