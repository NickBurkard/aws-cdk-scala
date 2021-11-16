package io.burkard.cdk.services.lambda

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SourceAccessConfiguration {

  def apply(
    uri: String,
    `type`: software.amazon.awscdk.services.lambda.SourceAccessConfigurationType
  ): software.amazon.awscdk.services.lambda.SourceAccessConfiguration =
    (new software.amazon.awscdk.services.lambda.SourceAccessConfiguration.Builder)
      .uri(uri)
      .`type`(`type`)
      .build()
}
