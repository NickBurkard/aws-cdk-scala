package io.burkard.cdk.services.cognito

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CompromisedCredentialsRiskConfigurationTypeProperty {

  def apply(
    actions: software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.CompromisedCredentialsActionsTypeProperty,
    eventFilter: Option[List[String]] = None
  ): software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.CompromisedCredentialsRiskConfigurationTypeProperty =
    (new software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment.CompromisedCredentialsRiskConfigurationTypeProperty.Builder)
      .actions(actions)
      .eventFilter(eventFilter.map(_.asJava).orNull)
      .build()
}
