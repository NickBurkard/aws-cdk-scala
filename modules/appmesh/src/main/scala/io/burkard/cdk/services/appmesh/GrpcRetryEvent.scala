package io.burkard.cdk.services.appmesh


sealed abstract class GrpcRetryEvent(val underlying: software.amazon.awscdk.services.appmesh.GrpcRetryEvent)
  extends Product
    with Serializable


object GrpcRetryEvent {
  implicit def toAws(value: GrpcRetryEvent): software.amazon.awscdk.services.appmesh.GrpcRetryEvent =
    Option(value).map(_.underlying).orNull

  case object Cancelled
    extends GrpcRetryEvent(software.amazon.awscdk.services.appmesh.GrpcRetryEvent.CANCELLED)

  case object DeadlineExceeded
    extends GrpcRetryEvent(software.amazon.awscdk.services.appmesh.GrpcRetryEvent.DEADLINE_EXCEEDED)

  case object InternalError
    extends GrpcRetryEvent(software.amazon.awscdk.services.appmesh.GrpcRetryEvent.INTERNAL_ERROR)

  case object ResourceExhausted
    extends GrpcRetryEvent(software.amazon.awscdk.services.appmesh.GrpcRetryEvent.RESOURCE_EXHAUSTED)

  case object Unavailable
    extends GrpcRetryEvent(software.amazon.awscdk.services.appmesh.GrpcRetryEvent.UNAVAILABLE)
}
