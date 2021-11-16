package io.burkard.cdk.services.cognito

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnUserPoolUser {

  def apply(
    internalResourceId: String,
    userPoolId: String,
    username: Option[String] = None,
    clientMetadata: Option[AnyRef] = None,
    userAttributes: Option[List[_]] = None,
    forceAliasCreation: Option[Boolean] = None,
    validationData: Option[List[_]] = None,
    messageAction: Option[String] = None,
    desiredDeliveryMediums: Option[List[String]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.cognito.CfnUserPoolUser =
    software.amazon.awscdk.services.cognito.CfnUserPoolUser.Builder
      .create(stackCtx, internalResourceId)
      .userPoolId(userPoolId)
      .username(username.orNull)
      .clientMetadata(clientMetadata.orNull)
      .userAttributes(userAttributes.map(_.asJava).orNull)
      .forceAliasCreation(forceAliasCreation.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .validationData(validationData.map(_.asJava).orNull)
      .messageAction(messageAction.orNull)
      .desiredDeliveryMediums(desiredDeliveryMediums.map(_.asJava).orNull)
      .build()
}
