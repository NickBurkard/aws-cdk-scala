package io.burkard.cdk.services.s3

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnStorageLens {

  def apply(
    internalResourceId: String,
    storageLensConfiguration: software.amazon.awscdk.services.s3.CfnStorageLens.StorageLensConfigurationProperty,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.s3.CfnStorageLens =
    software.amazon.awscdk.services.s3.CfnStorageLens.Builder
      .create(stackCtx, internalResourceId)
      .storageLensConfiguration(storageLensConfiguration)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
