package io.burkard.cdk.services.appflow

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object VeevaSourcePropertiesProperty {

  def apply(
    `object`: String,
    includeRenditions: Option[Boolean] = None,
    documentType: Option[String] = None,
    includeSourceFiles: Option[Boolean] = None,
    includeAllVersions: Option[Boolean] = None
  ): software.amazon.awscdk.services.appflow.CfnFlow.VeevaSourcePropertiesProperty =
    (new software.amazon.awscdk.services.appflow.CfnFlow.VeevaSourcePropertiesProperty.Builder)
      .`object`(`object`)
      .includeRenditions(includeRenditions.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .documentType(documentType.orNull)
      .includeSourceFiles(includeSourceFiles.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .includeAllVersions(includeAllVersions.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
