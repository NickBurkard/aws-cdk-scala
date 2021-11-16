package io.burkard.cdk.services.codepipeline

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CrossRegionSupport {

  def apply(
    replicationBucket: software.amazon.awscdk.services.s3.IBucket,
    stack: software.amazon.awscdk.Stack
  ): software.amazon.awscdk.services.codepipeline.CrossRegionSupport =
    (new software.amazon.awscdk.services.codepipeline.CrossRegionSupport.Builder)
      .replicationBucket(replicationBucket)
      .stack(stack)
      .build()
}
