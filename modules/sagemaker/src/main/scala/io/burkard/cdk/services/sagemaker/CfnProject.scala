package io.burkard.cdk.services.sagemaker

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnProject {

  def apply(
    internalResourceId: String,
    projectName: String,
    serviceCatalogProvisioningDetails: AnyRef,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    projectDescription: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.sagemaker.CfnProject =
    software.amazon.awscdk.services.sagemaker.CfnProject.Builder
      .create(stackCtx, internalResourceId)
      .projectName(projectName)
      .serviceCatalogProvisioningDetails(serviceCatalogProvisioningDetails)
      .tags(tags.map(_.asJava).orNull)
      .projectDescription(projectDescription.orNull)
      .build()
}
