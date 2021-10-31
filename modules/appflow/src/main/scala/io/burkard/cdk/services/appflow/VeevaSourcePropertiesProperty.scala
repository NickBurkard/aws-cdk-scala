package io.burkard.cdk.services.appflow

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object VeevaSourcePropertiesProperty {

  def apply(
    includeRenditions: Option[Boolean] = None,
    `object`: Option[String] = None,
    documentType: Option[String] = None,
    includeSourceFiles: Option[Boolean] = None,
    includeAllVersions: Option[Boolean] = None
  ): software.amazon.awscdk.services.appflow.CfnFlow.VeevaSourcePropertiesProperty =
    (new software.amazon.awscdk.services.appflow.CfnFlow.VeevaSourcePropertiesProperty.Builder)
      .includeRenditions(includeRenditions.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .`object`(`object`.orNull)
      .documentType(documentType.orNull)
      .includeSourceFiles(includeSourceFiles.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .includeAllVersions(includeAllVersions.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
