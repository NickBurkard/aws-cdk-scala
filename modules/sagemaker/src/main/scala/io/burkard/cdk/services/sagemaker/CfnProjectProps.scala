package io.burkard.cdk.services.sagemaker

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnProjectProps {

  def apply(
    projectName: String,
    serviceCatalogProvisioningDetails: AnyRef,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    projectDescription: Option[String] = None
  ): software.amazon.awscdk.services.sagemaker.CfnProjectProps =
    (new software.amazon.awscdk.services.sagemaker.CfnProjectProps.Builder)
      .projectName(projectName)
      .serviceCatalogProvisioningDetails(serviceCatalogProvisioningDetails)
      .tags(tags.map(_.asJava).orNull)
      .projectDescription(projectDescription.orNull)
      .build()
}
