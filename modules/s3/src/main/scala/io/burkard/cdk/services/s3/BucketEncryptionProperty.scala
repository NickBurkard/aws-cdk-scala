package io.burkard.cdk.services.s3

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object BucketEncryptionProperty {

  def apply(
    serverSideEncryptionConfiguration: List[_]
  ): software.amazon.awscdk.services.s3.CfnBucket.BucketEncryptionProperty =
    (new software.amazon.awscdk.services.s3.CfnBucket.BucketEncryptionProperty.Builder)
      .serverSideEncryptionConfiguration(serverSideEncryptionConfiguration.asJava)
      .build()
}
