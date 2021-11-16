package io.burkard.cdk.services.codepipeline

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ServiceCatalogDeployActionBeta1Props {

  def apply(
    productVersionName: String,
    productId: String,
    templatePath: software.amazon.awscdk.services.codepipeline.ArtifactPath,
    role: Option[software.amazon.awscdk.services.iam.IRole] = None,
    productVersionDescription: Option[String] = None,
    variablesNamespace: Option[String] = None,
    runOrder: Option[Number] = None,
    actionName: Option[String] = None
  ): software.amazon.awscdk.services.codepipeline.actions.ServiceCatalogDeployActionBeta1Props =
    (new software.amazon.awscdk.services.codepipeline.actions.ServiceCatalogDeployActionBeta1Props.Builder)
      .productVersionName(productVersionName)
      .productId(productId)
      .templatePath(templatePath)
      .role(role.orNull)
      .productVersionDescription(productVersionDescription.orNull)
      .variablesNamespace(variablesNamespace.orNull)
      .runOrder(runOrder.orNull)
      .actionName(actionName.orNull)
      .build()
}
