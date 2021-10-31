package io.burkard.cdk.services.cognito

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnUserPoolUser {

  def apply(
    internalResourceId: String,
    username: Option[String] = None,
    clientMetadata: Option[AnyRef] = None,
    userAttributes: Option[List[_]] = None,
    forceAliasCreation: Option[Boolean] = None,
    validationData: Option[List[_]] = None,
    messageAction: Option[String] = None,
    userPoolId: Option[String] = None,
    desiredDeliveryMediums: Option[List[String]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.cognito.CfnUserPoolUser =
    software.amazon.awscdk.services.cognito.CfnUserPoolUser.Builder
      .create(stackCtx, internalResourceId)
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
