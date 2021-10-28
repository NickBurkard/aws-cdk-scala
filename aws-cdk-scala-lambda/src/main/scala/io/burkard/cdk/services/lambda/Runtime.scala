package io.burkard.cdk.services.lambda

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object Runtime {

  def apply(
    name: String,
    family: software.amazon.awscdk.services.lambda.RuntimeFamily,
    supportsCodeGuruProfiling: Option[Boolean] = None,
    supportsInlineCode: Option[Boolean] = None,
    bundlingDockerImage: Option[String] = None
  ): software.amazon.awscdk.services.lambda.Runtime =
    software.amazon.awscdk.services.lambda.Runtime.Builder
      .create(name, family)
      .supportsCodeGuruProfiling(supportsCodeGuruProfiling.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .supportsInlineCode(supportsInlineCode.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .bundlingDockerImage(bundlingDockerImage.orNull)
      .build()
}
