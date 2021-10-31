package io.burkard.cdk.services.servicecatalog

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnCloudFormationProductProps {

  def apply(
    supportEmail: Option[String] = None,
    name: Option[String] = None,
    supportUrl: Option[String] = None,
    supportDescription: Option[String] = None,
    replaceProvisioningArtifacts: Option[Boolean] = None,
    provisioningArtifactParameters: Option[List[_]] = None,
    acceptLanguage: Option[String] = None,
    distributor: Option[String] = None,
    owner: Option[String] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProductProps =
    (new software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProductProps.Builder)
      .supportEmail(supportEmail.orNull)
      .name(name.orNull)
      .supportUrl(supportUrl.orNull)
      .supportDescription(supportDescription.orNull)
      .replaceProvisioningArtifacts(replaceProvisioningArtifacts.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .provisioningArtifactParameters(provisioningArtifactParameters.map(_.asJava).orNull)
      .acceptLanguage(acceptLanguage.orNull)
      .distributor(distributor.orNull)
      .owner(owner.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
