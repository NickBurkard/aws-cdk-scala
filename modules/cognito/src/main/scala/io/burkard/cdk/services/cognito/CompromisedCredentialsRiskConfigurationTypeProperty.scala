package io.burkard.cdk.services.cognito

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CompromisedCredentialsRiskConfigurationTypeProperty {

  def apply(
    eventFilter: Option[List[String]] = None,
    actions: Option[software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.CompromisedCredentialsActionsTypeProperty] = None
  ): software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.CompromisedCredentialsRiskConfigurationTypeProperty =
    (new software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.CompromisedCredentialsRiskConfigurationTypeProperty.Builder)
      .eventFilter(eventFilter.map(_.asJava).orNull)
      .actions(actions.orNull)
      .build()
}
