package io.burkard.cdk.services.codebuild

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object BucketCacheOptions {

  def apply(
    prefix: Option[String] = None
  ): software.amazon.awscdk.services.codebuild.BucketCacheOptions =
    (new software.amazon.awscdk.services.codebuild.BucketCacheOptions.Builder)
      .prefix(prefix.orNull)
      .build()
}
