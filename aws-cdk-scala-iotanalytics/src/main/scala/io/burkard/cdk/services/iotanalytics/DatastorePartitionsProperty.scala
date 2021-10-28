package io.burkard.cdk.services.iotanalytics

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object DatastorePartitionsProperty {

  def apply(
    partitions: Option[List[_]] = None
  ): software.amazon.awscdk.services.iotanalytics.CfnDatastore.DatastorePartitionsProperty =
    (new software.amazon.awscdk.services.iotanalytics.CfnDatastore.DatastorePartitionsProperty.Builder)
      .partitions(partitions.map(_.asJava).orNull)
      .build()
}
