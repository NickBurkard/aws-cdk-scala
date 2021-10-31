package io.burkard.cdk.services.gamelift

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnMatchmakingConfiguration {

  def apply(
    internalResourceId: String,
    gameSessionQueueArns: Option[List[String]] = None,
    name: Option[String] = None,
    flexMatchMode: Option[String] = None,
    description: Option[String] = None,
    requestTimeoutSeconds: Option[Number] = None,
    additionalPlayerCount: Option[Number] = None,
    gameProperties: Option[List[_]] = None,
    customEventData: Option[String] = None,
    gameSessionData: Option[String] = None,
    notificationTarget: Option[String] = None,
    acceptanceTimeoutSeconds: Option[Number] = None,
    acceptanceRequired: Option[Boolean] = None,
    backfillMode: Option[String] = None,
    ruleSetName: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.gamelift.CfnMatchmakingConfiguration =
    software.amazon.awscdk.services.gamelift.CfnMatchmakingConfiguration.Builder
      .create(stackCtx, internalResourceId)
      .gameSessionQueueArns(gameSessionQueueArns.map(_.asJava).orNull)
      .name(name.orNull)
      .flexMatchMode(flexMatchMode.orNull)
      .description(description.orNull)
      .requestTimeoutSeconds(requestTimeoutSeconds.orNull)
      .additionalPlayerCount(additionalPlayerCount.orNull)
      .gameProperties(gameProperties.map(_.asJava).orNull)
      .customEventData(customEventData.orNull)
      .gameSessionData(gameSessionData.orNull)
      .notificationTarget(notificationTarget.orNull)
      .acceptanceTimeoutSeconds(acceptanceTimeoutSeconds.orNull)
      .acceptanceRequired(acceptanceRequired.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .backfillMode(backfillMode.orNull)
      .ruleSetName(ruleSetName.orNull)
      .build()
}
