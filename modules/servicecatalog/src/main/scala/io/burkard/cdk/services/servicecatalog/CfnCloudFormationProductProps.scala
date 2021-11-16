package io.burkard.cdk.services.servicecatalog

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnCloudFormationProductProps {

  def apply(
    name: String,
    provisioningArtifactParameters: List[_],
    owner: String,
    supportEmail: Option[String] = None,
    supportUrl: Option[String] = None,
    supportDescription: Option[String] = None,
    replaceProvisioningArtifacts: Option[Boolean] = None,
    acceptLanguage: Option[String] = None,
    distributor: Option[String] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProductProps =
    (new software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProductProps.Builder)
      .name(name)
      .provisioningArtifactParameters(provisioningArtifactParameters.asJava)
      .owner(owner)
      .supportEmail(supportEmail.orNull)
      .supportUrl(supportUrl.orNull)
      .supportDescription(supportDescription.orNull)
      .replaceProvisioningArtifacts(replaceProvisioningArtifacts.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .acceptLanguage(acceptLanguage.orNull)
      .distributor(distributor.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
