package io.burkard.cdk.pipelines

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ConnectionSourceOptions {

  def apply(
    connectionArn: String,
    codeBuildCloneOutput: Option[Boolean] = None,
    triggerOnPush: Option[Boolean] = None
  ): software.amazon.awscdk.pipelines.ConnectionSourceOptions =
    (new software.amazon.awscdk.pipelines.ConnectionSourceOptions.Builder)
      .connectionArn(connectionArn)
      .codeBuildCloneOutput(codeBuildCloneOutput.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .triggerOnPush(triggerOnPush.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
