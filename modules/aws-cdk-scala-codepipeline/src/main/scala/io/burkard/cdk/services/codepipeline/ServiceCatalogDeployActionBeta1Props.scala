package io.burkard.cdk.services.codepipeline

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ServiceCatalogDeployActionBeta1Props {

  def apply(
    role: Option[software.amazon.awscdk.services.iam.IRole] = None,
    productVersionDescription: Option[String] = None,
    productVersionName: Option[String] = None,
    variablesNamespace: Option[String] = None,
    runOrder: Option[Number] = None,
    actionName: Option[String] = None,
    productId: Option[String] = None,
    templatePath: Option[software.amazon.awscdk.services.codepipeline.ArtifactPath] = None
  ): software.amazon.awscdk.services.codepipeline.actions.ServiceCatalogDeployActionBeta1Props =
    (new software.amazon.awscdk.services.codepipeline.actions.ServiceCatalogDeployActionBeta1Props.Builder)
      .role(role.orNull)
      .productVersionDescription(productVersionDescription.orNull)
      .productVersionName(productVersionName.orNull)
      .variablesNamespace(variablesNamespace.orNull)
      .runOrder(runOrder.orNull)
      .actionName(actionName.orNull)
      .productId(productId.orNull)
      .templatePath(templatePath.orNull)
      .build()
}
