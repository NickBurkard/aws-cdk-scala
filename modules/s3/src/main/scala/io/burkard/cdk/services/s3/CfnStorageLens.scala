package io.burkard.cdk.services.s3

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnStorageLens {

  def apply(
    internalResourceId: String,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    storageLensConfiguration: Option[software.amazon.awscdk.services.s3.CfnStorageLens.StorageLensConfigurationProperty] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.s3.CfnStorageLens =
    software.amazon.awscdk.services.s3.CfnStorageLens.Builder
      .create(stackCtx, internalResourceId)
      .tags(tags.map(_.asJava).orNull)
      .storageLensConfiguration(storageLensConfiguration.orNull)
      .build()
}
