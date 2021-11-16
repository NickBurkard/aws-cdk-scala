package io.burkard.cdk.services.backup

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ConditionResourceTypeProperty {

  def apply(
    conditionType: String,
    conditionValue: String,
    conditionKey: String
  ): software.amazon.awscdk.services.backup.CfnBackupSelection.ConditionResourceTypeProperty =
    (new software.amazon.awscdk.services.backup.CfnBackupSelection.ConditionResourceTypeProperty.Builder)
      .conditionType(conditionType)
      .conditionValue(conditionValue)
      .conditionKey(conditionKey)
      .build()
}
