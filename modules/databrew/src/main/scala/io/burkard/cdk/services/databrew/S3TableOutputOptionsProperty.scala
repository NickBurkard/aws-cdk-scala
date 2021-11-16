package io.burkard.cdk.services.databrew

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object S3TableOutputOptionsProperty {

  def apply(
    location: software.amazon.awscdk.services.databrew.CfnJob.S3LocationProperty
  ): software.amazon.awscdk.services.databrew.CfnJob.S3TableOutputOptionsProperty =
    (new software.amazon.awscdk.services.databrew.CfnJob.S3TableOutputOptionsProperty.Builder)
      .location(location)
      .build()
}
