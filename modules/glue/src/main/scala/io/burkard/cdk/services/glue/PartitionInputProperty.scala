package io.burkard.cdk.services.glue

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object PartitionInputProperty {

  def apply(
    values: Option[List[String]] = None,
    parameters: Option[AnyRef] = None,
    storageDescriptor: Option[software.amazon.awscdk.services.glue.CfnPartition.StorageDescriptorProperty] = None
  ): software.amazon.awscdk.services.glue.CfnPartition.PartitionInputProperty =
    (new software.amazon.awscdk.services.glue.CfnPartition.PartitionInputProperty.Builder)
      .values(values.map(_.asJava).orNull)
      .parameters(parameters.orNull)
      .storageDescriptor(storageDescriptor.orNull)
      .build()
}
