package io.burkard.cdk.services.athena

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EngineVersionProperty {

  def apply(
    selectedEngineVersion: Option[String] = None,
    effectiveEngineVersion: Option[String] = None
  ): software.amazon.awscdk.services.athena.CfnWorkGroup.EngineVersionProperty =
    (new software.amazon.awscdk.services.athena.CfnWorkGroup.EngineVersionProperty.Builder)
      .selectedEngineVersion(selectedEngineVersion.orNull)
      .effectiveEngineVersion(effectiveEngineVersion.orNull)
      .build()
}
