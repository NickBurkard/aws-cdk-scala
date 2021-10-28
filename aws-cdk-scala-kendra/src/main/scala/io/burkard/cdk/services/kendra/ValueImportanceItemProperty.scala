package io.burkard.cdk.services.kendra

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ValueImportanceItemProperty {

  def apply(
    key: Option[String] = None,
    value: Option[Number] = None
  ): software.amazon.awscdk.services.kendra.CfnIndex.ValueImportanceItemProperty =
    (new software.amazon.awscdk.services.kendra.CfnIndex.ValueImportanceItemProperty.Builder)
      .key(key.orNull)
      .value(value.orNull)
      .build()
}
