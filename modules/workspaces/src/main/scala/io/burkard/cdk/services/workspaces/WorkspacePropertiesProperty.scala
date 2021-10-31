package io.burkard.cdk.services.workspaces

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object WorkspacePropertiesProperty {

  def apply(
    userVolumeSizeGib: Option[Number] = None,
    rootVolumeSizeGib: Option[Number] = None,
    runningMode: Option[String] = None,
    runningModeAutoStopTimeoutInMinutes: Option[Number] = None,
    computeTypeName: Option[String] = None
  ): software.amazon.awscdk.services.workspaces.CfnWorkspace.WorkspacePropertiesProperty =
    (new software.amazon.awscdk.services.workspaces.CfnWorkspace.WorkspacePropertiesProperty.Builder)
      .userVolumeSizeGib(userVolumeSizeGib.orNull)
      .rootVolumeSizeGib(rootVolumeSizeGib.orNull)
      .runningMode(runningMode.orNull)
      .runningModeAutoStopTimeoutInMinutes(runningModeAutoStopTimeoutInMinutes.orNull)
      .computeTypeName(computeTypeName.orNull)
      .build()
}
