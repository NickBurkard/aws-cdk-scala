package io.burkard.cdk.services.backup

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TagCondition {

  def apply(
    key: String,
    value: String,
    operation: Option[software.amazon.awscdk.services.backup.TagOperation] = None
  ): software.amazon.awscdk.services.backup.TagCondition =
    (new software.amazon.awscdk.services.backup.TagCondition.Builder)
      .key(key)
      .value(value)
      .operation(operation.orNull)
      .build()
}
