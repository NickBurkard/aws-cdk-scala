package io.burkard.cdk.services.lambda

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object LambdaRuntimeProps {

  def apply(
    supportsCodeGuruProfiling: Option[Boolean] = None,
    supportsInlineCode: Option[Boolean] = None,
    bundlingDockerImage: Option[String] = None
  ): software.amazon.awscdk.services.lambda.LambdaRuntimeProps =
    (new software.amazon.awscdk.services.lambda.LambdaRuntimeProps.Builder)
      .supportsCodeGuruProfiling(supportsCodeGuruProfiling.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .supportsInlineCode(supportsInlineCode.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .bundlingDockerImage(bundlingDockerImage.orNull)
      .build()
}
