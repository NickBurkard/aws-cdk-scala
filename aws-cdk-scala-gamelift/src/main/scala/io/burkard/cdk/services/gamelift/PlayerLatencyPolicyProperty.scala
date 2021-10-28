package io.burkard.cdk.services.gamelift

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object PlayerLatencyPolicyProperty {

  def apply(
    maximumIndividualPlayerLatencyMilliseconds: Option[Number] = None,
    policyDurationSeconds: Option[Number] = None
  ): software.amazon.awscdk.services.gamelift.CfnGameSessionQueue.PlayerLatencyPolicyProperty =
    (new software.amazon.awscdk.services.gamelift.CfnGameSessionQueue.PlayerLatencyPolicyProperty.Builder)
      .maximumIndividualPlayerLatencyMilliseconds(maximumIndividualPlayerLatencyMilliseconds.orNull)
      .policyDurationSeconds(policyDurationSeconds.orNull)
      .build()
}
