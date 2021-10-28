package io.burkard.cdk.services.cognito

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnUserPoolUserProps {

  def apply(
    username: Option[String] = None,
    clientMetadata: Option[AnyRef] = None,
    userAttributes: Option[List[_]] = None,
    forceAliasCreation: Option[Boolean] = None,
    validationData: Option[List[_]] = None,
    messageAction: Option[String] = None,
    userPoolId: Option[String] = None,
    desiredDeliveryMediums: Option[List[String]] = None
  ): software.amazon.awscdk.services.cognito.CfnUserPoolUserProps =
    (new software.amazon.awscdk.services.cognito.CfnUserPoolUserProps.Builder)
      .username(username.orNull)
      .clientMetadata(clientMetadata.orNull)
      .userAttributes(userAttributes.map(_.asJava).orNull)
      .forceAliasCreation(forceAliasCreation.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .validationData(validationData.map(_.asJava).orNull)
      .messageAction(messageAction.orNull)
      .userPoolId(userPoolId.orNull)
      .desiredDeliveryMediums(desiredDeliveryMediums.map(_.asJava).orNull)
      .build()
}
