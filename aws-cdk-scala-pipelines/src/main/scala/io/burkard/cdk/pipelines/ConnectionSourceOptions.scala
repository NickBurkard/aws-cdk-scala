package io.burkard.cdk.pipelines

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ConnectionSourceOptions {

  def apply(
    codeBuildCloneOutput: Option[Boolean] = None,
    connectionArn: Option[String] = None,
    triggerOnPush: Option[Boolean] = None
  ): software.amazon.awscdk.pipelines.ConnectionSourceOptions =
    (new software.amazon.awscdk.pipelines.ConnectionSourceOptions.Builder)
      .codeBuildCloneOutput(codeBuildCloneOutput.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .connectionArn(connectionArn.orNull)
      .triggerOnPush(triggerOnPush.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
