package io.burkard.cdk.services.redshift

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ScheduledActionTypeProperty {

  def apply(
    pauseCluster: Option[software.amazon.awscdk.services.redshift.CfnScheduledAction.PauseClusterMessageProperty] = None,
    resizeCluster: Option[software.amazon.awscdk.services.redshift.CfnScheduledAction.ResizeClusterMessageProperty] = None,
    resumeCluster: Option[software.amazon.awscdk.services.redshift.CfnScheduledAction.ResumeClusterMessageProperty] = None
  ): software.amazon.awscdk.services.redshift.CfnScheduledAction.ScheduledActionTypeProperty =
    (new software.amazon.awscdk.services.redshift.CfnScheduledAction.ScheduledActionTypeProperty.Builder)
      .pauseCluster(pauseCluster.orNull)
      .resizeCluster(resizeCluster.orNull)
      .resumeCluster(resumeCluster.orNull)
      .build()
}
