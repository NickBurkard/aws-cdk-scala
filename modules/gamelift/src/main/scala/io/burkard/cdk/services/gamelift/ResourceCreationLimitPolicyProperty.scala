package io.burkard.cdk.services.gamelift

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ResourceCreationLimitPolicyProperty {

  def apply(
    policyPeriodInMinutes: Option[Number] = None,
    newGameSessionsPerCreator: Option[Number] = None
  ): software.amazon.awscdk.services.gamelift.CfnFleet.ResourceCreationLimitPolicyProperty =
    (new software.amazon.awscdk.services.gamelift.CfnFleet.ResourceCreationLimitPolicyProperty.Builder)
      .policyPeriodInMinutes(policyPeriodInMinutes.orNull)
      .newGameSessionsPerCreator(newGameSessionsPerCreator.orNull)
      .build()
}
