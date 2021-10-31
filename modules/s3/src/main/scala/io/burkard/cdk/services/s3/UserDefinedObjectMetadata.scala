package io.burkard.cdk.services.s3

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object UserDefinedObjectMetadata {

  def apply: software.amazon.awscdk.services.s3.deployment.UserDefinedObjectMetadata =
    (new software.amazon.awscdk.services.s3.deployment.UserDefinedObjectMetadata.Builder)
      
      .build()
}
