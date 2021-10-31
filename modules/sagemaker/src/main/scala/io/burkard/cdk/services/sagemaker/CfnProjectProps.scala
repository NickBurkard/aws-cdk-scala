package io.burkard.cdk.services.sagemaker

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnProjectProps {

  def apply(
    projectName: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    projectDescription: Option[String] = None,
    serviceCatalogProvisioningDetails: Option[AnyRef] = None
  ): software.amazon.awscdk.services.sagemaker.CfnProjectProps =
    (new software.amazon.awscdk.services.sagemaker.CfnProjectProps.Builder)
      .projectName(projectName.orNull)
      .tags(tags.map(_.asJava).orNull)
      .projectDescription(projectDescription.orNull)
      .serviceCatalogProvisioningDetails(serviceCatalogProvisioningDetails.orNull)
      .build()
}
