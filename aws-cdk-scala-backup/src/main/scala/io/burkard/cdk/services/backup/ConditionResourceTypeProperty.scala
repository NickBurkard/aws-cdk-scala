package io.burkard.cdk.services.backup

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ConditionResourceTypeProperty {

  def apply(
    conditionType: Option[String] = None,
    conditionValue: Option[String] = None,
    conditionKey: Option[String] = None
  ): software.amazon.awscdk.services.backup.CfnBackupSelection.ConditionResourceTypeProperty =
    (new software.amazon.awscdk.services.backup.CfnBackupSelection.ConditionResourceTypeProperty.Builder)
      .conditionType(conditionType.orNull)
      .conditionValue(conditionValue.orNull)
      .conditionKey(conditionKey.orNull)
      .build()
}
