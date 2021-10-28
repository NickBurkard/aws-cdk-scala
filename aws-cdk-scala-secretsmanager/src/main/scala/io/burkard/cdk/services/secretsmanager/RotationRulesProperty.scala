package io.burkard.cdk.services.secretsmanager

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object RotationRulesProperty {

  def apply(
    automaticallyAfterDays: Option[Number] = None
  ): software.amazon.awscdk.services.secretsmanager.CfnRotationSchedule.RotationRulesProperty =
    (new software.amazon.awscdk.services.secretsmanager.CfnRotationSchedule.RotationRulesProperty.Builder)
      .automaticallyAfterDays(automaticallyAfterDays.orNull)
      .build()
}
